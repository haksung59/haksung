//
//  PracticeSwiftUIMemoApp.swift
//  PracticeSwiftUIMemo
//
//  Created by haksung on 2022/11/01.
//

import SwiftUI

@main
struct PracticeSwiftUIMemoApp: App {
    let persistenceController = PersistenceController.shared
    let store = MemoStore()

    var body: some Scene {
        WindowGroup {
            MemoListScene()
                .environment(\.managedObjectContext, persistenceController.container.viewContext)
                .environmentObject(store)
        }
    }
}
