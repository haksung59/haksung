//
//  PracticeMemoApp.swift
//  PracticeMemo
//
//  Created by haksung on 2022/11/01.
//

import SwiftUI

@main
struct PracticeMemoApp: App {
    let persistenceController = PersistenceController.shared

    var body: some Scene {
        WindowGroup {
            MainListView()
                .environment(\.managedObjectContext, persistenceController.container.viewContext)
        }
    }
}
